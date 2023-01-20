FROM python:3.10.4
WORKDIR /lr2
COPY server.py ./
COPY output/ ./output/
RUN pip install mysql-connector-python
CMD ["python3", "./server.py"]
