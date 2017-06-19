
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.LoginPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: models.pages.LoginPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/controllers/*13.62*/.routes.Assets.versioned("materialize/css/materialize.min.css")),format.raw/*13.125*/("""" />
  </head>
  
  <body>
      <!--Import jQuery before materialize.js-->
    <div class="container">
      <div class="row">
        <div id="left-blank-block" class="col s3"></div>
        <div id="login-window" class="col s6">
          <div class="z-depth-2">
            <div class="blue-grey lighten-5">
              <h3 id="loginwindow-title" class="teal z-depth-1">"""),_display_(/*24.66*/page/*24.70*/.title),format.raw/*24.76*/("""</h3>
              <hr />
              <div id="loginwindow-input">
                </form>
                """),_display_(/*28.18*/helper/*28.24*/.form(action = routes.LoginPageController.login())/*28.74*/ {_display_(Seq[Any](format.raw/*28.76*/("""
                    """),_display_(/*29.22*/CSRF/*29.26*/.formField),format.raw/*29.36*/("""
                    """),format.raw/*30.21*/("""<p>学号<input id="student-id" type="text" name="studentID" /><p>
                    <p>密码<input id="student-password" type="password" name="password" /></p>
                    <p>"""),_display_(/*32.25*/page/*32.29*/.errorMsg),format.raw/*32.38*/("""</p>
                    <button class="btn waves-effect waves-light" type="submit" name="action">
                      login <i class="material-icons right">登录</i>
                    </button>
                """)))}),format.raw/*36.18*/("""
              """),format.raw/*37.15*/("""</div>
            </div>
          </div>
          </div>
        <div id="right-blank-block" class="col s3"></div>
        </div>
      </div>
    </div>
    <script type="text/javascript" src=""""),_display_(/*45.42*/controllers/*45.53*/.routes.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*45.114*/(""""> </script>
    <script type="text/javascript" src=""""),_display_(/*46.42*/controllers/*46.53*/.routes.Assets.versioned("javascripts/jquery-3.2.1.min.js")),format.raw/*46.112*/(""""> </script>
    <script type="text/javacript" src= """"),_display_(/*47.42*/controllers/*47.53*/.routes.Assets.versioned("javascripts/main.js")),format.raw/*47.100*/(""""> </script>
  </body>

</html>"""))
      }
    }
  }

  def render(page:models.pages.LoginPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.LoginPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 18:55:03 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/login.scala.html
                  HASH: c74860bea85e6456f48062962b04e86ab2c382a6
                  MATRIX: 761->1|901->31|931->53|959->55|1367->436|1387->447|1472->510|1887->898|1900->902|1927->908|2069->1023|2084->1029|2143->1079|2183->1081|2233->1104|2246->1108|2277->1118|2327->1140|2536->1322|2549->1326|2579->1335|2827->1552|2871->1568|3104->1774|3124->1785|3207->1846|3289->1901|3309->1912|3390->1971|3472->2026|3492->2037|3561->2084
                  LINES: 27->1|32->1|34->4|35->5|43->13|43->13|43->13|54->24|54->24|54->24|58->28|58->28|58->28|58->28|59->29|59->29|59->29|60->30|62->32|62->32|62->32|66->36|67->37|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47
                  -- GENERATED --
              */
          