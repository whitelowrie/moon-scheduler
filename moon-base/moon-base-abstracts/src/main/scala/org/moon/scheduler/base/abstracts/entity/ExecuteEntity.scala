package org.moon.scheduler.base.abstracts.entity

import org.moon.scheduler.base.abstracts.entity.BaseEntity.IEntity
import org.moon.scheduler.base.abstracts.entity.GraphEntity.IGraph

object ExecuteEntity {

  case class Job[V](id: Long, name: String, graph: IGraph[V], status: Int) extends IEntity

}
