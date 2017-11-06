(ns getting-started-with-quil.pg96
  (:require [quil.core :as q]))

            
(defn setup []
  (let [font (q/create-font "/images/SourceCodePro-Regular.ttf" 24)]
       (q/text-font font)
       (q/background 102)
       (q/text "That's one small step for man...." 26 24 240 100)))
       
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])
  
