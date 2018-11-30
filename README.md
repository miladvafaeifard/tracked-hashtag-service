# Tracked Hash Tag application using Kotlin and Redis Database 🚧 under construction 🚧


run the application
`mvn clean spring-boot:run`

post new hashTag

`curl -H "Content-type: application/json" -X POST -d '{"hashTag":"java", "queue":"java"}' http://localhost:8080/api/tracked-hash-tag`

get hashTag list

`curl -X GET http://localhost:8080/api/tracked-hash-tag | jq .`

response: `[{ "hashTag": "java", "queue": "java" }]`

Docker

`docker clean install docker:build`

We should wee the springfivebyexample/tracked_hashtag on the image list in docker running.

`docker run -d --name hashtag-tracker --net twitter -p 8080:8080 springfivebyexample/tracked_hashtag`