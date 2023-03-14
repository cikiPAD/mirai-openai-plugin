package xyz.cssxsh.mirai.openai.data

import xyz.cssxsh.mirai.economy.*
import xyz.cssxsh.mirai.economy.service.*

public object MiraiOpenAiTokens : EconomyCurrency {
   init {
       EconomyService.register(this)
   }

    override val description: String = "OpenAi API 的分词消耗"
    override val id: String = "openai"
    override val name: String = "OpenAi Tokens"
}