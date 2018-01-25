# IFTM - UBERLANDIA 11/09/2017

## ESTRUTURA DO PROJETO DESTINADO A DICIPLINA PROJETO INTEGRADOR 4

### ::: Projeto utilizando Spring Boot :::

Integrantes : <br />
 ... Eduardo <br />
 ... Haniery <br />
 ... Neirivon <br />
 ... Elyvaldson <br />
 ... André <br />

projeto-comanda (PROJETO)<br>
--- src/main/java (ARQUIVOS JAVA) <br />
------ com.integrador.projeto_comanda <br />
--------- domain (CAMADA DE DOMINIO/MODEL) <br />
--------- repositories (CAMADA DE DAO/INTERFACES) <br />
--------- resources (CAMADA DE CONTROLE) <br />
--------- services (CAMADA DE LOGICA/REGRAS) <br />
------------ exception (TRATAR EXCEÇÕES/MENSAGENS DE ERRO) <br />
--- src/test/java <br />
------ com.integrador.projeto_comanda <br />
--------- AppTest.java (TESTES AUTOMATIZADOS JUNIT) <br />
--- src/main/resources <br />
------ db <br />
--------- migration (PASTA DO MIGRATE) <br />
------------ V01__cria_e_registra_categorias.sql <br />
------------ V02__cria_e_registra_produtos.sql <br />
------ application.properties (ARQUIVO DE CONFIGURACAO) <br />
--- pom.xml (TODAS AS DEPENDENCIAS DO PROJETO) <br />
