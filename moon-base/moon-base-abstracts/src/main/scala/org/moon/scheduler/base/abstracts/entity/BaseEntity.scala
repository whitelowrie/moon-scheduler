package org.moon.scheduler.base.abstracts.entity

object BaseEntity {

  trait IBase

  trait IEntity extends Serializable with IBase

}
