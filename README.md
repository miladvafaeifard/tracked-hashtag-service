# Tracked Hash Tag application using Kotlin and Redis Database 🚧 under construction 🚧

## Run the application locally

`mvn clean spring-boot:run`

post new hashTag

`curl -H "Content-type: application/json" -X POST -d '{"hashTag":"java", "queue":"java"}' http://localhost:8080/api/tracked-hash-tag`

get hashTag list

`curl -X GET http://localhost:8080/api/tracked-hash-tag | jq .`

response: `[{ "hashTag": "java", "queue": "java" }]`

## Run the application in Docker env

`docker clean install docker:build`

We should wee the springfivebyexample/tracked_hashtag on the image list in docker running.

`docker run -d --name hashtag-tracker --net twitter -p 9090:9090 springfivebyexample/tracked_hashtag`

Automatically update container while the image being updated

`docker run -d --name hashtag-tracker --restart=always --net twitter -p 9090:9090 springfivebyexample/tracked_hashtag`

post new hashTag

`curl -H "Content-type: application/json" -X POST -d '{"hashTag":"java", "queue":"java"}' http://localhost:9090/api/tracked-hash-tag`

get hashTag list

`curl -X GET http://localhost:9090/api/tracked-hash-tag | jq .`

response: `[{ "hashTag": "java", "queue": "java" }]`

response: `[{ "hashTag": "GoLang", "queue": "GoLang" }]`