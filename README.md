## Cloud Parking Project

### Realizando Deploy na Nuvem de um Conjunto de API’s Desenvolvida em Spring Boot
*Novembro de 2022*

## 🔨 Ações necessárias

🐬​ **Ter o docker instalado**
  
- Execute o comando: 
```
$ docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=321 -d postgres:10-alpine
```  

 
🛑​ **Stop Database**
- Execute o comando:
```
$ docker stop parking-db
```

🚀​ **Start Database**
- Execute o comando:
```
$ docker start parking-db 
``` 


