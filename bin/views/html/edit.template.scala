
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(userForm:Form[User],user : User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*1.38*/import helper._


Seq[Any](format.raw/*1.36*/(""" """),format.raw/*2.1*/("""<html>
<head>
<title>Edit Form</title>
</head>
<body>
	<h1>------Edit Form ----</h1>

	"""),_display_(/*9.3*/helper/*9.9*/.form(action= routes.HomeController.updateUser())/*9.58*/{_display_(Seq[Any](format.raw/*9.59*/("""
		"""),format.raw/*10.3*/("""<br> <label>
			<h3>Id :-</h3>
		</label> <input name="userId" type="text" value="""),_display_(/*12.52*/user/*12.56*/.userId),format.raw/*12.63*/(""" """),format.raw/*12.64*/("""readonly="readonly"> <br> <label>
			<h3>First Name :-</h3>
		</label> <input name="fName" type="text" value="""),_display_(/*14.51*/user/*14.55*/.fName),format.raw/*14.61*/("""> <br> <label>
			<h3>Middle Name :-</h3>
		</label> <input name="mName" type="text" value="""),_display_(/*16.51*/user/*16.55*/.mName),format.raw/*16.61*/("""> <br> <label>
			<h3>Last Name :-</h3>
		</label> <input name="lName" type="text" value="""),_display_(/*18.51*/user/*18.55*/.lName),format.raw/*18.61*/("""> <br> <label>
			<h3>Email Id :-</h3>
		</label> <input name="userEmail" type="text" value="""),_display_(/*20.55*/user/*20.59*/.userEmail),format.raw/*20.69*/(""" """),format.raw/*20.70*/("""><br> <label>
			<h3>Password :-</h3>
		</label> <input name="password" type="text" value="""),_display_(/*22.54*/user/*22.58*/.password),format.raw/*22.67*/("""> <br> <br> <input
			type="submit" value="Edit User">
			""")))}),format.raw/*24.5*/("""
"""),format.raw/*25.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[User],User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-14T18:37:12.477746
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/edit.scala.html
                  HASH: 9ab7967284963dd764b53bad7847ff8cec99fc7c
                  MATRIX: 915->2|1022->37|1067->35|1094->53|1207->141|1220->147|1277->196|1315->197|1345->200|1454->282|1467->286|1495->293|1524->294|1661->404|1674->408|1701->414|1820->506|1833->510|1860->516|1977->606|1990->610|2017->616|2137->709|2150->713|2181->723|2210->724|2328->815|2341->819|2371->828|2460->887|2488->888
                  LINES: 27->1|30->1|33->1|33->2|40->9|40->9|40->9|40->9|41->10|43->12|43->12|43->12|43->12|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|51->20|51->20|51->20|51->20|53->22|53->22|53->22|55->24|56->25
                  -- GENERATED --
              */
          