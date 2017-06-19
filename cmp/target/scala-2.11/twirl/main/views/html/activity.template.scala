
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object activity_Scope0 {
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

class activity extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.ActivityPage,play.twirl.api.HtmlFormat.Appendable] {

  /**
Required values:
class ActivityPage:
    Student user
    String title
    Activity activity
**/
  def apply/*8.2*/(page: models.pages.ActivityPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.35*/("""
"""),_display_(/*9.2*/main_templete(page.user.studentName)/*9.38*/(page.title)/*9.50*/ {_display_(Seq[Any](format.raw/*9.52*/("""
    """),format.raw/*10.5*/("""<div id="top"></div>
    <div id="head" class="row section">
      if (user.priviledge = StudentInfo.ADMIN) """),format.raw/*12.48*/("""{"""),format.raw/*12.49*/("""
        """),format.raw/*13.9*/("""<i class="right-align material-icon"> mode_edit </button>
      """),format.raw/*14.7*/("""}"""),format.raw/*14.8*/("""
    """),format.raw/*15.5*/("""</div>
    <div class="section"> """),_display_(/*16.28*/page/*16.32*/.activity.discription),format.raw/*16.53*/(""" """),format.raw/*16.54*/("""</div>
""")))}/*17.2*/ {_display_(Seq[Any](format.raw/*17.4*/("""
    """),format.raw/*18.5*/("""<div class="col hide-on-small-only m3 l2">
        <ul class="section table-of-contents">
            <li><a href="#top">????</a></li>
        </ul>
    </div>
""")))}))
      }
    }
  }

  def render(page:models.pages.ActivityPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.ActivityPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**
Required values:
class ActivityPage:
    Student user
    String title
    Activity activity
**/
object activity extends activity_Scope0.activity
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 18:48:18 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/activity.scala.html
                  HASH: aa60c07a7abc705257508d5d9423b73970adb5aa
                  MATRIX: 872->109|1000->142|1028->145|1072->181|1092->193|1131->195|1164->201|1302->311|1331->312|1368->322|1460->387|1488->388|1521->394|1583->429|1596->433|1638->454|1667->455|1694->464|1733->466|1766->472
                  LINES: 33->8|38->8|39->9|39->9|39->9|39->9|40->10|42->12|42->12|43->13|44->14|44->14|45->15|46->16|46->16|46->16|46->16|47->17|47->17|48->18
                  -- GENERATED --
              */
          