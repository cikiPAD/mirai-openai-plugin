forked from cssxsh/mirai-openai-plugin

基于1.5.1版本做了定制化修改:
1.需要启动 @ 前缀，启动前缀检查，启动立即回复
2.在上述基础上，机器人会自行配置预设，并且从第一个问题开始立即回复
3.修改了结束对话回复逻辑，不再会延迟很久@你会话被关闭了，输入结束对话才会回复你，相关配置无效了
