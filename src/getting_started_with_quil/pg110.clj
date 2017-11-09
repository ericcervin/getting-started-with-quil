(ns getting-started-with-quil.pg110
  (:require [quil.core :as q]))

(defn draw []
  (q/background 204)
  (doseq [i (range 20 (q/width) 20)]
         (let [mx  (/ (q/mouse-x) 10)
               offset-a (+ (* -1 mx) (rand (* 2 mx)))
               offset-b (+ (* -1 mx) (rand (* 2 mx)))]
           (q/line (+ i offset-a) 20 (- i offset-b) 100))))    

(q/defsketch practice
  :size [240 120]
  :draw draw
  :features [:keep-on-top])



