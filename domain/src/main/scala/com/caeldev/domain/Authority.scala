package com.caeldev.domain

import javax.persistence._
import scala.beans.BeanProperty

/**
 * Copyright (c) 2012 - 2013 Caeldev, Inc.
 *
 * User: cael
 * Date: 28/10/2013
 * Time: 18:41
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
@Entity
@Table(name ="AUTHORITY")
class Authority extends Serializable {

  @Id
  @BeanProperty var id:Long = _

  @Column(name="authority")
  @BeanProperty var authority:String = _

  @ManyToOne
  @BeanProperty var user:User = _

}
