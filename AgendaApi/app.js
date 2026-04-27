const URL_BASE = '/api.agenda';
const express = require('express');
const app = express();
const morgan = require('morgan');
app.use(morgan('dev'));
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({extended : false}));
app.use(bodyParser.json());

// rota default/welcome/inicial/padrão
// http://localhost:3000/api.agenda
app.use(URL_BASE,(req,res,next) => {
    res.status(200).send({
        resposta : 'URL base do serviço funcionou!!!'
    });
});

// rota não encontrada
app.use((req,res,next) => {
    const erro = new Error('Rota inexistente!');
    erro.status = 404;
    next(erro);
});

module.exports = app;