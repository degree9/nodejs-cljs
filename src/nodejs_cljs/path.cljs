(ns nodejs-cljs.path
  (:require [cljs.nodejs :as node]))

(def path (node/require "path"))
