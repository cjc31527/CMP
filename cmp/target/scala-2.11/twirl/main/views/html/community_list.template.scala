
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object community_list_Scope0 {
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

     object community_list_Scope1 {
import models.Community

class community_list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.CommunityListPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(page: models.pages.CommunityListPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.40*/("""

"""),_display_(/*13.2*/main_templete(page.user.studentName)/*13.38*/(page.title)/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
    """),format.raw/*14.5*/("""<div class="container">
        <div class="row">
            """),_display_(/*16.14*/for(community <- page.communityList) yield /*16.50*/ {_display_(Seq[Any](format.raw/*16.52*/("""
                """),format.raw/*17.17*/("""<div class="col m4 card blue-gray darken-1">
                    <div class="card-content white-text">
                        <span class="card-title"><em>community.communityName</em></span>
                        <p> community.description </p>
                    </div>
                    <div class="card-action">
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.CommunityPageController.showPage(community.communityID)),format.raw/*23.97*/("""">社团主页</a>
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.CommunityManagementPageController.showPage(community.communityID)),format.raw/*24.107*/("""">社团管理页</a>
                    </div>
                </div>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div>
    </div>
""")))}/*30.2*/ {_display_(Seq[Any](format.raw/*30.4*/("""

""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(page:models.pages.CommunityListPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.CommunityListPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}
}

/**/
object community_list extends community_list_Scope0.community_list_Scope1.community_list
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 20:30:48 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/community_list.scala.html
                  HASH: 7b8657d2304122238a64a7af4a561fb21a77d1c4
                  MATRIX: 849->179|983->217|1014->222|1059->258|1080->270|1120->272|1153->278|1245->343|1297->379|1337->381|1383->399|1770->759|1785->765|1862->821|1935->867|1950->873|2038->939|2147->1017|2184->1027|2223->1048|2262->1050|2297->1055
                  LINES: 30->11|35->11|37->13|37->13|37->13|37->13|38->14|40->16|40->16|40->16|41->17|47->23|47->23|47->23|48->24|48->24|48->24|51->27|52->28|54->30|54->30|56->32
                  -- GENERATED --
              */
          