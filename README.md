# 🎓 Escola API

API REST com Java Spring Boot + MySQL rodando em Docker.

## 🚀 Como subir o projeto

​```bash
cd escola-api
sudo docker-compose up -d
​```

## 🌐 Acessar a interface

Abra no navegador:

​```
http://<IP-DA-VM>:8080
​```

## 📡 Endpoints

### Listar todos os alunos
​```
GET http://<IP-DA-VM>:8080/alunos
​```

### Cadastrar aluno
​```
POST http://<IP-DA-VM>:8080/alunos
Content-Type: application/json

{
  "nome": "João Silva",
  "email": "joao@email.com",
  "curso": "ADS"
}
​```

### Buscar aluno por ID
​```
GET http://<IP-DA-VM>:8080/alunos/{id}
​```

### Deletar aluno
​```
DELETE http://<IP-DA-VM>:8080/alunos/{id}
​```

## 🗄️ Acessar o banco de dados

​```bash
sudo docker exec -it mysql-escola mysql -u aluno -paluno123 escola
​```

### Comandos SQL úteis

​```sql
SELECT * FROM aluno;
INSERT INTO aluno (nome, email, curso) VALUES ('Maria', 'maria@email.com', 'ADS');
DELETE FROM aluno WHERE id = 1;
exit
​```

## 🐳 Containers

| Container    | Imagem                  | Porta |
|--------------|-------------------------|-------|
| escola-api   | Java 21 + Spring Boot   | 8080  |
| mysql-escola | MySQL 5.7               | 3306  |
