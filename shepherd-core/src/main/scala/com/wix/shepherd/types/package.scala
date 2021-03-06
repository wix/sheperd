package com.wix.shepherd

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.wix.shepherd.sections.SectionSpecificSubscription
import com.wix.shepherd.sections.SectionSpecificSubscription.NoSpecificSectionSubscription
import com.wix.shepherd.types.SectionId

package object types {
  type SectionId = String
}

case class RegistrationEvent(sectionId: SectionId, sectionSpecificSubscription: SectionSpecificSubscription = NoSpecificSectionSubscription) extends ShepherdClientRequest

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
trait ShepherdClientRequest

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
trait ShepherdServerUpdate
