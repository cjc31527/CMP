
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/git_repos/Community-Management-Platform/cmp/conf/routes
// @DATE:Mon Jun 19 09:20:52 CST 2017


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
