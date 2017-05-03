(ns nodejs-cljs.v8
  (:require [cljs.nodejs :as node]))

(def v8 (node/require "v8"))

(defn getHeapSpaceStatistics []
  (.getHeapSpaceStatistics v8))

(defn getHeapStatistics []
  (.getHeapStatistics v8))

(defn setFlagsFromString [s]
  (.setFlagsFromString v8 s))
