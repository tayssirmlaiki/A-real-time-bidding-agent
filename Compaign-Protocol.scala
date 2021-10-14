case class Compaign( id: Int, country: String, targeting: Targeting, banners: List[Banner], bid: Double)
case class Targeting( targetedSiteIds: Array[TargetedSiteId])
case class TargetedSiteId( id: String)
case class Banner( id: Int, src: String, width: Int, height: Int)
