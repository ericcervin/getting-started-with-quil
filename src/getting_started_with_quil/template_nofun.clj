(ns getting-started-with-quil.template_nofun
  (:require [quil.core :as q]))


(defn setup [])


(defn draw [])

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



