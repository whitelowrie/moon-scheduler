package org.moon.scheduler.base.abstracts.entity

object EnumEntity {

  enum Status(value: Int):
    // 已经提交
    case SUBMIT  extends Status(1)
    // 准备执行
    case PREPARE extends Status(2)
    // 已经启动
    case START   extends Status(3)
    // 正在运行
    case RUNNING extends Status(4)
    //
}
