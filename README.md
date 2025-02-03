# SERVICIO DE PRUEBA USER PARA PRUEBA TECNICA

este repositorio contiene el proyecto independiente spring-boot de implementación de este servicio de prueba

## Descarga y ejecución

recordar que debe de estar corriendo el contenedor de la base de datos, aqui esta el comando:

```bash
docker pull mysql
docker run --name to_listo_test -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=test -p 3306:3306 -d mysql:latest
```

Este servicio requiere que el [Servidor Eureka](https://github.com/MrForero/toListo-test-EurekaServer) este corriendo para poder ser registrado y funcionar sin nugun problema.
