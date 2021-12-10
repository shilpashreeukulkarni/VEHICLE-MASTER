// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_3: controllers.HomeController,
  // @LINE:7
  CountController_2: controllers.CountController,
  // @LINE:9
  AsyncController_1: controllers.AsyncController,
  // @LINE:15
  VehicleController_0: controllers.VehicleController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_3: controllers.HomeController,
    // @LINE:7
    CountController_2: controllers.CountController,
    // @LINE:9
    AsyncController_1: controllers.AsyncController,
    // @LINE:15
    VehicleController_0: controllers.VehicleController
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_1, VehicleController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_1, VehicleController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/6.0/write/all_vehicles/details""", """controllers.VehicleController.createVehicle(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/6.1/read/single_vehicle/details""", """controllers.VehicleController.fetchOneVehicle(vehicle_id:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/6.2/read/all_vehicles/details""", """controllers.VehicleController.getAllVehicles()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/6.3/update/vehicle/details""", """controllers.VehicleController.updateVehicle(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/6.4/delete/vehicle/details""", """controllers.VehicleController.deleteVehicle(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/6.5/delete/all_vehicle/details""", """controllers.VehicleController.deleteAllVehicles()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_2.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_1.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_about3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about3_invoker = createInvoker(
    HomeController_3.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_VehicleController_createVehicle4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/6.0/write/all_vehicles/details")))
  )
  private[this] lazy val controllers_VehicleController_createVehicle4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      VehicleController_0.createVehicle(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "createVehicle",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/6.0/write/all_vehicles/details""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_VehicleController_fetchOneVehicle5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/6.1/read/single_vehicle/details")))
  )
  private[this] lazy val controllers_VehicleController_fetchOneVehicle5_invoker = createInvoker(
    VehicleController_0.fetchOneVehicle(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "fetchOneVehicle",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/6.1/read/single_vehicle/details""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_VehicleController_getAllVehicles6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/6.2/read/all_vehicles/details")))
  )
  private[this] lazy val controllers_VehicleController_getAllVehicles6_invoker = createInvoker(
    VehicleController_0.getAllVehicles(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "getAllVehicles",
      Nil,
      "GET",
      this.prefix + """api/6.2/read/all_vehicles/details""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_VehicleController_updateVehicle7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/6.3/update/vehicle/details")))
  )
  private[this] lazy val controllers_VehicleController_updateVehicle7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      VehicleController_0.updateVehicle(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "updateVehicle",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/6.3/update/vehicle/details""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_VehicleController_deleteVehicle8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/6.4/delete/vehicle/details")))
  )
  private[this] lazy val controllers_VehicleController_deleteVehicle8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      VehicleController_0.deleteVehicle(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "deleteVehicle",
      Seq(classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/6.4/delete/vehicle/details""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_VehicleController_deleteAllVehicles9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/6.5/delete/all_vehicle/details")))
  )
  private[this] lazy val controllers_VehicleController_deleteAllVehicles9_invoker = createInvoker(
    VehicleController_0.deleteAllVehicles(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "deleteAllVehicles",
      Nil,
      "DELETE",
      this.prefix + """api/6.5/delete/all_vehicle/details""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:7
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_2.count)
      }
  
    // @LINE:9
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_1.message)
      }
  
    // @LINE:11
    case controllers_HomeController_about3_route(params@_) =>
      call { 
        controllers_HomeController_about3_invoker.call(HomeController_3.about)
      }
  
    // @LINE:15
    case controllers_VehicleController_createVehicle4_route(params@_) =>
      call { 
        controllers_VehicleController_createVehicle4_invoker.call(
          req => VehicleController_0.createVehicle(req))
      }
  
    // @LINE:17
    case controllers_VehicleController_fetchOneVehicle5_route(params@_) =>
      call(params.fromQuery[Int]("vehicle_id", Some(0))) { (vehicle_id) =>
        controllers_VehicleController_fetchOneVehicle5_invoker.call(VehicleController_0.fetchOneVehicle(vehicle_id))
      }
  
    // @LINE:19
    case controllers_VehicleController_getAllVehicles6_route(params@_) =>
      call { 
        controllers_VehicleController_getAllVehicles6_invoker.call(VehicleController_0.getAllVehicles())
      }
  
    // @LINE:21
    case controllers_VehicleController_updateVehicle7_route(params@_) =>
      call { 
        controllers_VehicleController_updateVehicle7_invoker.call(
          req => VehicleController_0.updateVehicle(req))
      }
  
    // @LINE:23
    case controllers_VehicleController_deleteVehicle8_route(params@_) =>
      call { 
        controllers_VehicleController_deleteVehicle8_invoker.call(
          req => VehicleController_0.deleteVehicle(req))
      }
  
    // @LINE:25
    case controllers_VehicleController_deleteAllVehicles9_route(params@_) =>
      call { 
        controllers_VehicleController_deleteAllVehicles9_invoker.call(VehicleController_0.deleteAllVehicles())
      }
  }
}
