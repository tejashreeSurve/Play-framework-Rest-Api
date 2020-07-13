
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userform:Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""


"""),format.raw/*9.1*/("""<form action=""""),_display_(/*9.16*/routes/*9.22*/.HomeController.save()),format.raw/*9.44*/("""" method="post">


	<div class="form-group row  ">
		<label class="col-sm-2 form-control-label">Phone Number</label>
		<div class="col-sm-10">
			<input name="phoneNumber" id="lastName" class="form-control"
				type="text" placeholder="Phone Number">
		</div>
	</div>


	<div class="form-group row ">
		<label class="col-sm-2 form-control-label">First Name</label>
		<div class="col-sm-10">
			<input name="firstName" id="firstName" class="form-control"
				type="text" placeholder="First Name">
		</div>
	</div>
	
	"""))
      }
    }
  }

  def render(userform:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userform)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userform) => apply(userform)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-11T11:23:48.042447
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/addUser.scala.html
                  HASH: f0c15227e031a571ed012bcf3f1bc111dd8dfba1
                  MATRIX: 913->5|1028->27|1057->30|1098->45|1112->51|1154->73
                  LINES: 27->5|32->6|35->9|35->9|35->9|35->9
                  -- GENERATED --
              */
          