
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object activities_list_Scope0 {
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

     object activities_list_Scope1 {
import models.pages.ActivityListPage

class activities_list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ActivityListPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(page: ActivityListPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.26*/("""


"""),_display_(/*13.2*/main_templete(page.user.studentName)/*13.38*/(page.title)/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
"""),format.raw/*14.1*/("""<p>
    <table>
        <thead>
            <tr>
                <td> 活动名称</td>
                <td> 活动开始时间 </td>
                <td> 活动结束时间 </td>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*24.14*/for(ativitiy <- page.attendedActivites) yield /*24.53*/ {_display_(Seq[Any](format.raw/*24.55*/(""" 
                """),format.raw/*25.17*/("""<tr>
                    <td> ativitiy.name </td>
                    <td> ativitiy.startdate </td>
                    <td> ativitiy.enddate </td>
                    <!-- TODO -->
                </tr>
            """)))}),format.raw/*31.14*/("""
                """),format.raw/*32.17*/("""<!-- TODO -->
        </tbody>
    </table>
</p>
""")))}/*36.2*/ {_display_(Seq[Any](format.raw/*36.4*/("""

""")))}))
      }
    }
  }

  def render(page:ActivityListPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((ActivityListPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}
}

/**/
object activities_list extends activities_list_Scope0.activities_list_Scope1.activities_list
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 19:54:50 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/activities_list.scala.html
                  HASH: b53f9bcee310ea8a03cc53a675debcbd05f245e2
                  MATRIX: 851->168|971->192|1004->199|1049->235|1070->247|1110->249|1139->251|1388->473|1443->512|1483->514|1530->533|1784->756|1830->774|1902->828|1941->830
                  LINES: 30->10|35->10|38->13|38->13|38->13|38->13|39->14|49->24|49->24|49->24|50->25|56->31|57->32|61->36|61->36
                  -- GENERATED --
              */
          