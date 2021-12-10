// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:9
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def message: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def about: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:5
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseVehicleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def getAllVehicles(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/6.2/read/all_vehicles/details")
    }
  
    // @LINE:17
    def fetchOneVehicle(vehicle_id:Int = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/6.1/read/single_vehicle/details" + play.core.routing.queryString(List(if(vehicle_id == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("vehicle_id", vehicle_id)))))
    }
  
    // @LINE:23
    def deleteVehicle(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/6.4/delete/vehicle/details")
    }
  
    // @LINE:21
    def updateVehicle(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/6.3/update/vehicle/details")
    }
  
    // @LINE:25
    def deleteAllVehicles(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/6.5/delete/all_vehicle/details")
    }
  
    // @LINE:15
    def createVehicle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/6.0/write/all_vehicles/details")
    }
  
  }

  // @LINE:7
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def count: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
