(ns nodejs-cljs.path
  (:require [cljs.nodejs :as node]))

(def path (node/require "path"))

(defn basename [p & [ext]]
  (.basename path p ext))

(defn delimiter []
  (obj/get path "delimiter"))

(defn dirname [p]
  (.dirname path p))

(defn extname [p]
  (.extname path p))

(defn format [p]
  (.format path p))

(defn isAbsolute [p]
  (.isAbsolute path p))

(defn join [p]
  (.join path p))

(defn normalize [p]
  (.normalize path p))

(defn parse [p]
  (.parse path p))

(defn posix []
  (obj/get path "posix"))

(defn relative [from to]
  (.relative path from to))

(defn resolve [p]
  (.join resolve p))

(defn sep []
  (obj/get path "sep"))

(defn win32 []
  (obj/get path "win32"))
