(ns getting-started-with-quil.template_fun
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/smooth))

(defn draw [state]
  (q/background 255)
  (q/fill 192)
  (q/ellipse 100 100 30 30))

(q/defsketch practice
  :size [200 200]
  :setup setup
  ;;:update quil_update
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

