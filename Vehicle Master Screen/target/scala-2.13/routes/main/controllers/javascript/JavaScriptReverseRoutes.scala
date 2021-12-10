// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:9
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseVehicleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def getAllVehicles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.getAllVehicles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/6.2/read/all_vehicles/details"})
        }
      """
    )
  
    // @LINE:17
    def fetchOneVehicle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.fetchOneVehicle",
      """
        function(vehicle_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/6.1/read/single_vehicle/details" + _qS([(vehicle_id0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("vehicle_id", vehicle_id0))])})
        }
      """
    )
  
    // @LINE:23
    def deleteVehicle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.deleteVehicle",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/6.4/delete/vehicle/details"})
        }
      """
    )
  
    // @LINE:21
    def updateVehicle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.updateVehicle",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/6.3/update/vehicle/details"})
        }
      """
    )
  
    // @LINE:25
    def deleteAllVehicles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.deleteAllVehicles",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/6.5/delete/all_vehicle/details"})
        }
      """
    )
  
    // @LINE:15
    def createVehicle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.createVehicle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/6.0/write/all_vehicles/details"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }


}
