(ns getting-started-with-quil.pg29
  (:require [quil.core :as q]))


(defn setup []
  (q/begin-shape)
  (q/fill 153 176 180)
  (q/vertex 180 82)
  (q/vertex 207 36)
  (q/vertex 214 63)
  (q/vertex 407 11)
  (q/vertex 412 30)
  (q/vertex 219 82)
  (q/vertex 226 109)
  (q/end-shape :close))  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



