(ns ednjs.core
  (:require
   [cljs.reader :as edn]))

(defn ^:export parseEDNString [str]
  (clj->js (edn/read-string str)))

(defn ^:export toEDNString [obj & [key]]
  (pr-str (js->clj obj :keywordize-keys key)))