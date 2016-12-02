(ns nodejs-cljs.http
  (:require [cljs.nodejs :as node]
            [goog.object :as obj]))

(def http (node/require "http"))

(defn createServer [listener]
  (.createServer http listener))

(defn listen
  ([exp port] (.listen exp port))
  ([exp port hostname] (.listen exp port hostname)))
