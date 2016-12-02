(ns nodejs-cljs.process
  (:require [goog.object :as obj]))

(def process js/process)

(defn platform [] (obj/get process "platform"))
