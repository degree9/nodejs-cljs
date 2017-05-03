(ns nodejs-cljs.query-strings
  (:require [cljs.nodejs :as node]
            [goog.object :as obj]))

(def query-strings (node/require "querystrings"))

(defn escape [s]
  (.escape query-strings s))

(defn parse [s & [seq eq opts]]
  (.parse query-strings s seq eq opts))

(defn stringify [o & [seq eq opts]]
  (.stringify query-strings o seq eq opts))

(defn unescape [s]
  (.unescape query-strings s))
