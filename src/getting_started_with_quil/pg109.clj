(ns getting-started-with-quil.pg109
  (:require [quil.core :as q]))



(defn draw []
  (println (rand (q/mouse-x))));

  

(q/defsketch practice
  :size [100 100]
  :draw draw
  :features [:keep-on-top])



