
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/git_repos/Community-Management-Platform/cmp/conf/routes
// @DATE:Mon Jun 19 09:20:52 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  LoginPageController_6: controllers.LoginPageController,
  // @LINE:10
  Assets_11: controllers.Assets,
  // @LINE:22
  HomePageController_7: controllers.HomePageController,
  // @LINE:27
  ActivityPageController_1: controllers.ActivityPageController,
  // @LINE:30
  ActivityListPageController_9: controllers.ActivityListPageController,
  // @LINE:33
  ActivityEditPageController_3: controllers.ActivityEditPageController,
  // @LINE:40
  CommunityListPageController_4: controllers.CommunityListPageController,
  // @LINE:42
  CommunityPageController_10: controllers.CommunityPageController,
  // @LINE:44
  CommunityManagementPageController_5: controllers.CommunityManagementPageController,
  // @LINE:47
  CommunityEditPageController_2: controllers.CommunityEditPageController,
  // @LINE:55
  MessageListPageController_8: controllers.MessageListPageController,
  // @LINE:57
  MessageEditPageController_0: controllers.MessageEditPageController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    LoginPageController_6: controllers.LoginPageController,
    // @LINE:10
    Assets_11: controllers.Assets,
    // @LINE:22
    HomePageController_7: controllers.HomePageController,
    // @LINE:27
    ActivityPageController_1: controllers.ActivityPageController,
    // @LINE:30
    ActivityListPageController_9: controllers.ActivityListPageController,
    // @LINE:33
    ActivityEditPageController_3: controllers.ActivityEditPageController,
    // @LINE:40
    CommunityListPageController_4: controllers.CommunityListPageController,
    // @LINE:42
    CommunityPageController_10: controllers.CommunityPageController,
    // @LINE:44
    CommunityManagementPageController_5: controllers.CommunityManagementPageController,
    // @LINE:47
    CommunityEditPageController_2: controllers.CommunityEditPageController,
    // @LINE:55
    MessageListPageController_8: controllers.MessageListPageController,
    // @LINE:57
    MessageEditPageController_0: controllers.MessageEditPageController
  ) = this(errorHandler, LoginPageController_6, Assets_11, HomePageController_7, ActivityPageController_1, ActivityListPageController_9, ActivityEditPageController_3, CommunityListPageController_4, CommunityPageController_10, CommunityManagementPageController_5, CommunityEditPageController_2, MessageListPageController_8, MessageEditPageController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginPageController_6, Assets_11, HomePageController_7, ActivityPageController_1, ActivityListPageController_9, ActivityEditPageController_3, CommunityListPageController_4, CommunityPageController_10, CommunityManagementPageController_5, CommunityEditPageController_2, MessageListPageController_8, MessageEditPageController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginPageController.showPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginPageController.showPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginPageController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomePageController.showPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activities/""" + "$" + """id<[0-9]+>""", """controllers.ActivityPageController.showPage(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activities/list""", """controllers.ActivityListPageController.showPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activities/""" + "$" + """id<[0-9]+>/modify""", """controllers.ActivityEditPageController.showPage(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activities/""" + "$" + """id<[0-9]+>/modify""", """controllers.ActivityEditPageController.edit(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """communities/list""", """controllers.CommunityListPageController.showPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """communities/""" + "$" + """id<[0-9]+>""", """controllers.CommunityPageController.showPage(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """communities/""" + "$" + """id<[0-9]+>/manage""", """controllers.CommunityManagementPageController.showPage(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """communities/""" + "$" + """id<[0-9]+>/modify""", """controllers.CommunityEditPageController.showPage(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """communities/""" + "$" + """id<[0-9]+>/modify""", """controllers.CommunityEditPageController.edit(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """massages/list""", """controllers.MessageListPageController.showPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages/""" + "$" + """id<[0-9]+>/modify""", """controllers.MessageEditPageController.showPage(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages/""" + "$" + """id<[0-9]+>/modify""", """controllers.MessageEditPageController.edit(id:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_LoginPageController_showPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginPageController_showPage0_invoker = createInvoker(
    LoginPageController_6.showPage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginPageController",
      "showPage",
      Nil,
      "GET",
      """ DEFAULT MODULE
 An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginPageController_showPage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginPageController_showPage2_invoker = createInvoker(
    LoginPageController_6.showPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginPageController",
      "showPage",
      Nil,
      "GET",
      """ LOGIN MODULE
# login page""",
      this.prefix + """login"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginPageController_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginPageController_login3_invoker = createInvoker(
    LoginPageController_6.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginPageController",
      "login",
      Nil,
      "POST",
      """ HOME MODULE
# home page""",
      this.prefix + """login"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomePageController_showPage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomePageController_showPage4_invoker = createInvoker(
    HomePageController_7.showPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomePageController",
      "showPage",
      Nil,
      "GET",
      """# home page""",
      this.prefix + """home"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ActivityPageController_showPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activities/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_ActivityPageController_showPage5_invoker = createInvoker(
    ActivityPageController_1.showPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivityPageController",
      "showPage",
      Seq(classOf[Int]),
      "GET",
      """ ACTIVITY MODULE
# activity detailed page""",
      this.prefix + """activities/""" + "$" + """id<[0-9]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ActivityListPageController_showPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activities/list")))
  )
  private[this] lazy val controllers_ActivityListPageController_showPage6_invoker = createInvoker(
    ActivityListPageController_9.showPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivityListPageController",
      "showPage",
      Nil,
      "GET",
      """# activity list page""",
      this.prefix + """activities/list"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ActivityEditPageController_showPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activities/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/modify")))
  )
  private[this] lazy val controllers_ActivityEditPageController_showPage7_invoker = createInvoker(
    ActivityEditPageController_3.showPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivityEditPageController",
      "showPage",
      Seq(classOf[Int]),
      "GET",
      """# activity edit page""",
      this.prefix + """activities/""" + "$" + """id<[0-9]+>/modify"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ActivityEditPageController_edit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activities/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/modify")))
  )
  private[this] lazy val controllers_ActivityEditPageController_edit8_invoker = createInvoker(
    ActivityEditPageController_3.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivityEditPageController",
      "edit",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """activities/""" + "$" + """id<[0-9]+>/modify"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_CommunityListPageController_showPage9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("communities/list")))
  )
  private[this] lazy val controllers_CommunityListPageController_showPage9_invoker = createInvoker(
    CommunityListPageController_4.showPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityListPageController",
      "showPage",
      Nil,
      "GET",
      """ COMMUNITY MODULE
# community list page""",
      this.prefix + """communities/list"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_CommunityPageController_showPage10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("communities/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_CommunityPageController_showPage10_invoker = createInvoker(
    CommunityPageController_10.showPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityPageController",
      "showPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """communities/""" + "$" + """id<[0-9]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_CommunityManagementPageController_showPage11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("communities/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/manage")))
  )
  private[this] lazy val controllers_CommunityManagementPageController_showPage11_invoker = createInvoker(
    CommunityManagementPageController_5.showPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityManagementPageController",
      "showPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """communities/""" + "$" + """id<[0-9]+>/manage"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_CommunityEditPageController_showPage12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("communities/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/modify")))
  )
  private[this] lazy val controllers_CommunityEditPageController_showPage12_invoker = createInvoker(
    CommunityEditPageController_2.showPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityEditPageController",
      "showPage",
      Seq(classOf[Int]),
      "GET",
      """# modify page""",
      this.prefix + """communities/""" + "$" + """id<[0-9]+>/modify"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_CommunityEditPageController_edit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("communities/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/modify")))
  )
  private[this] lazy val controllers_CommunityEditPageController_edit13_invoker = createInvoker(
    CommunityEditPageController_2.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityEditPageController",
      "edit",
      Seq(classOf[Int]),
      "POST",
      """# post forms""",
      this.prefix + """communities/""" + "$" + """id<[0-9]+>/modify"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_MessageListPageController_showPage14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("massages/list")))
  )
  private[this] lazy val controllers_MessageListPageController_showPage14_invoker = createInvoker(
    MessageListPageController_8.showPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageListPageController",
      "showPage",
      Nil,
      "GET",
      """ MESSAGE MODULE
 massage list page""",
      this.prefix + """massages/list"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_MessageEditPageController_showPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/modify")))
  )
  private[this] lazy val controllers_MessageEditPageController_showPage15_invoker = createInvoker(
    MessageEditPageController_0.showPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageEditPageController",
      "showPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """messages/""" + "$" + """id<[0-9]+>/modify"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_MessageEditPageController_edit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/modify")))
  )
  private[this] lazy val controllers_MessageEditPageController_edit16_invoker = createInvoker(
    MessageEditPageController_0.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageEditPageController",
      "edit",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """messages/""" + "$" + """id<[0-9]+>/modify"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_LoginPageController_showPage0_route(params) =>
      call { 
        controllers_LoginPageController_showPage0_invoker.call(LoginPageController_6.showPage())
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_LoginPageController_showPage2_route(params) =>
      call { 
        controllers_LoginPageController_showPage2_invoker.call(LoginPageController_6.showPage)
      }
  
    // @LINE:19
    case controllers_LoginPageController_login3_route(params) =>
      call { 
        controllers_LoginPageController_login3_invoker.call(LoginPageController_6.login)
      }
  
    // @LINE:22
    case controllers_HomePageController_showPage4_route(params) =>
      call { 
        controllers_HomePageController_showPage4_invoker.call(HomePageController_7.showPage)
      }
  
    // @LINE:27
    case controllers_ActivityPageController_showPage5_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ActivityPageController_showPage5_invoker.call(ActivityPageController_1.showPage(id))
      }
  
    // @LINE:30
    case controllers_ActivityListPageController_showPage6_route(params) =>
      call { 
        controllers_ActivityListPageController_showPage6_invoker.call(ActivityListPageController_9.showPage)
      }
  
    // @LINE:33
    case controllers_ActivityEditPageController_showPage7_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ActivityEditPageController_showPage7_invoker.call(ActivityEditPageController_3.showPage(id))
      }
  
    // @LINE:35
    case controllers_ActivityEditPageController_edit8_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ActivityEditPageController_edit8_invoker.call(ActivityEditPageController_3.edit(id))
      }
  
    // @LINE:40
    case controllers_CommunityListPageController_showPage9_route(params) =>
      call { 
        controllers_CommunityListPageController_showPage9_invoker.call(CommunityListPageController_4.showPage)
      }
  
    // @LINE:42
    case controllers_CommunityPageController_showPage10_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommunityPageController_showPage10_invoker.call(CommunityPageController_10.showPage(id))
      }
  
    // @LINE:44
    case controllers_CommunityManagementPageController_showPage11_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommunityManagementPageController_showPage11_invoker.call(CommunityManagementPageController_5.showPage(id))
      }
  
    // @LINE:47
    case controllers_CommunityEditPageController_showPage12_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommunityEditPageController_showPage12_invoker.call(CommunityEditPageController_2.showPage(id))
      }
  
    // @LINE:50
    case controllers_CommunityEditPageController_edit13_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommunityEditPageController_edit13_invoker.call(CommunityEditPageController_2.edit(id))
      }
  
    // @LINE:55
    case controllers_MessageListPageController_showPage14_route(params) =>
      call { 
        controllers_MessageListPageController_showPage14_invoker.call(MessageListPageController_8.showPage)
      }
  
    // @LINE:57
    case controllers_MessageEditPageController_showPage15_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_MessageEditPageController_showPage15_invoker.call(MessageEditPageController_0.showPage(id))
      }
  
    // @LINE:59
    case controllers_MessageEditPageController_edit16_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_MessageEditPageController_edit16_invoker.call(MessageEditPageController_0.edit(id))
      }
  }
}
