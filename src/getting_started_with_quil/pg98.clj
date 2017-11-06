(ns getting-started-with-quil.pg98
  (:require [quil.core :as q]))

            
(defn setup []
  (let [network (q/load-shape "/images/network.svg")]
  
    (q/background 0)
    (q/shape network 30 10)
    (q/shape network 180 10 280 280)))
       
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])
  
