python3 ./scpinfo/scpinfo.py --csv 6 ./ecg/ECG_0/12.SCP >./rohdaten3.csv
for i in 13 14
    python3 ./scpinfo/scpinfo.py --csv 6 ./ecg/ECG_0/$i.SCP | tail -n +2 >>./rohdaten2.csv
end
