
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object message_edit_Scope0 {
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

class message_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.MessageEditPage,play.twirl.api.HtmlFormat.Appendable] {

  /**
Required Values:
class MassageEditPage:
    Student user;
    String title;
    Message message;
**/
  def apply/*9.2*/(page: models.pages.MessageEditPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*9.38*/("""
"""),_display_(/*11.2*/main_templete(page.user.studentName)/*11.38*/(page.title)/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.MessageEditPageController.edit(page.message.textID))/*12.86*/ {_display_(Seq[Any](format.raw/*12.88*/("""
        """),format.raw/*13.9*/("""<input placeholder=标题 id="input-title" name="title" type="text" class="validate">
        <label for="first_name">title</label>
        <textarea id="text-input" name="content" oninput="this.editor.update()"
              rows="6" cols="60"> **请输入** </textarea>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<div class="divider"> </div>
    <div id="preview" class="section"> </div>
    <button id="submit" class="btn waves-effect waves-light" type="submit" name="action">
      提交<i class="material-icons right">send</i> 
    </button>
""")))}/*23.2*/ {_display_(Seq[Any](format.raw/*23.4*/("""

""")))}))
      }
    }
  }

  def render(page:models.pages.MessageEditPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.MessageEditPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**
Required Values:
class MassageEditPage:
    Student user;
    String title;
    Message message;
**/
object message_edit extends message_edit_Scope0.message_edit
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 19:54:32 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/message_edit.scala.html
                  HASH: 42cba1ee6499049cfe9bd15d355fa48f9efd8ff4
                  MATRIX: 887->115|1033->151|1062->172|1107->208|1128->220|1168->222|1201->229|1216->235|1299->309|1339->311|1376->321|1677->592|1710->598|1963->833|2002->835
                  LINES: 33->9|38->9|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|45->17|46->18|51->23|51->23
                  -- GENERATED --
              */
          