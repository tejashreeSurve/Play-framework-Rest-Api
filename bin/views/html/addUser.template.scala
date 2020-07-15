
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
  def apply/*1.3*/(userForm:Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*1.26*/import helper._


Seq[Any](format.raw/*1.24*/(""" """),format.raw/*2.1*/("""<html>
<head>
<title>Add New User</title>
</head>
<body>
	<h1>------To Add new User fill the Form-----</h1>

	<form action=""""),_display_(/*9.17*/routes/*9.23*/.HomeController.saveUser()),format.raw/*9.49*/("""" method="POST">
		<br> <label>
			<h3>Id :-</h3>
		</label> <input name="userId" type="text"> <br> <label>
			<h3>First Name :-</h3>
		</label> <input name="fName" type="text"> <br> <label>
			<h3>Middle Name :-</h3>
		</label> <input name="mName" type="text"> <br> <label>
			<h3>Last Name :-</h3>
		</label> <input name="lName" type="text"> <br> <label>
			<h3>Email Id :-</h3>
		</label> <input name="userEmail" type="text"> <br> <label>
			<h3>Password :-</h3>
		</label> <input name="password" type="text"> <br> <br> <input
			type="submit" value="Add User">
</body>
</html>
"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-14T16:47:25.391239
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/addUser.scala.html
                  HASH: bb5ff0a5c39225ab2ae8161b790ebea73540bd53
                  MATRIX: 913->2|1008->25|1053->23|1080->41|1231->166|1245->172|1291->198
                  LINES: 27->1|30->1|33->1|33->2|40->9|40->9|40->9
                  -- GENERATED --
              */
          