package springfive.twittertracked

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackedHashTagApplication

fun main(args: Array<String>) {
    runApplication<TrackedHashTagApplication>(*args)
}
