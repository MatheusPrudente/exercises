# Write your SQL query statement below
select ww.id from weather w, weather ww where ww.recordDate - w.recordDate = 1 AND ww.temperature > w.temperature;
