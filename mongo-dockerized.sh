docker pull tutum/mongodb

docker stop mongo-db
docker rm mongo-db

docker run -d   -p 27017:27017 -p 28017:28017  --name=mongo-db -e AUTH=no tutum/mongodb 

winpty docker exec -it mongo-db bash