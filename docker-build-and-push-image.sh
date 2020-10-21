./gradlew clean build -x test

docker build -t easy-ticket .

docker tag easy-ticket aleferod/easy-ticket

docker push aleferod/easy-ticket