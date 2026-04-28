const express = require('express');
const router = express.Router();
const url = require('url');
const queryString = require('querystring');
const mysql = require('./mysql').pool;

/*
http://localhost:3000/api.agenda/contato-dao/create
{
    "nome" : "nome",
    "fone" : "fone",
    "email" : "email"
}
*/
router.post('/create', (req, res, next) => {
    const { nome, fone, email } = req.body
    const contato = { nome, fone, email }
    mysql.getConnection((error, conn) => {
        if (error) {
            return res.status(500).send({
                error: error,
                response: null
            });
        }
        conn.query(
            'INSERT INTO contato (nome,fone,email) VALUES (?,?,?)',
            [contato.nome, contato.fone, contato.email],
            (error, restultado, field) => {
                conn.release();
                if (error) {
                    return res.status(500).send({
                        error: error,
                        response: null
                    });
                }
                res.status(201).send({
                    response : 'Contato cadastrado com sucesso!',
                    id_contato : restultado.insertId
                });
            }
        );
    });
});

module.exports = router;