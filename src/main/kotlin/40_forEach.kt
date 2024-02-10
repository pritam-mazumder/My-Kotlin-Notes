fun main() {

    val agent = listOf("sova", "sage", "jett", "raze", "brim")
    agent.forEach { it -> println("Agents: $it") }

    val agentRole = mapOf("sova" to "initiator", "sage" to "sentinel", "jett" to "dualist", "raze" to "dualist")
    agentRole.forEach { (key, value) -> println("$key is $value") }
}