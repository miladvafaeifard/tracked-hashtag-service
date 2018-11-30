package springfive.twittertracked.domain.service

import org.springframework.stereotype.Service
import springfive.twittertracked.domain.TrackedHashTag
import springfive.twittertracked.domain.repository.TrackedHashTagRepository

@Service
class TrackedHashTagService(private val repository: TrackedHashTagRepository) {
    fun save(HashTag: TrackedHashTag) = this.repository.save(HashTag)
    fun all() = this.repository.findAll()
}