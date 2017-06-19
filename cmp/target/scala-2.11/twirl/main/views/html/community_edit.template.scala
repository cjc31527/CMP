
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object community_edit_Scope0 {
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

class community_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.CommunityEditPage,play.twirl.api.HtmlFormat.Appendable] {

  /**
Required Value:
class CommunityEditPage:
    Student user
    String title
    Community community
**/
  def apply/*9.2*/(page: models.pages.CommunityEditPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.40*/("""
"""),_display_(/*10.2*/main_templete(page.user.studentName)/*10.38*/(page.title)/*10.50*/ {_display_(Seq[Any](format.raw/*10.52*/("""
	  """),format.raw/*11.4*/("""<div class="input-field">
		<input placeholder="标题" id="input-name" type="text" class="validate">
		<label for="first_name"></label>
	  </div>
	    <div class="input-field">
 		  <textarea placeholder="介绍" id="text-input" class= "materialize-textarea" oninput="this.editor.update()"></textarea>
		  <label for="text-input"></label>
		</div>
	<div class="divider"> </div>
  </div>
	<div id="preview" class="section"> </div>
	<button id="submit" class="btn waves-effect waves-light" type="submit" name="action">
	  更改<i class="material-icons right"></i> 
	</button>
""")))}/*25.2*/ {_display_(Seq[Any](format.raw/*25.4*/("""

""")))}))
      }
    }
  }

  def render(page:models.pages.CommunityEditPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.CommunityEditPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**
Required Value:
class CommunityEditPage:
    Student user
    String title
    Community community
**/
object community_edit extends community_edit_Scope0.community_edit
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 20:37:27 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/community_edit.scala.html
                  HASH: 87592b8c674bbdfb618e48a1349328274770aecb
                  MATRIX: 895->117|1028->155|1057->158|1102->194|1123->206|1163->208|1195->213|1792->792|1831->794
                  LINES: 33->9|38->9|39->10|39->10|39->10|39->10|40->11|54->25|54->25
                  -- GENERATED --
              */
          