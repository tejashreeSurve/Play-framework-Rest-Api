// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teju/Downloads/usermangement-play/conf/routes
// @DATE:Sat Jul 11 11:19:22 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
