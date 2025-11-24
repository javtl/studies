# Quant Python Stack Nobody Talks About
A curated list of essential Python libraries used in quantitative finance, for portfolio optimization, derivatives pricing, econometrics, and AI-driven research.
 Each library includes a short overview, use case, and installation command.

### 1️⃣ CVXPy
Convex optimization for finance and engineering. Lets you translate mathematical models, like portfolio variance minimization, risk parity, or calibration problems, directly into solvable Python code.
 When to use: Whenever your problem can be written as “minimize risk subject to constraints.”
 Install:
pip install cvxpy


### 2️⃣ QuantLib
Industry-grade framework for option pricing, yield curves, fixed income analytics, and stochastic modeling. The gold standard in quantitative finance libraries.
 When to use: Pricing, fixed-income analytics, Monte Carlo simulations, and quantitative risk models.
 Install:
pip install QuantLib


### 3️⃣ PyPortfolioOpt
High-level portfolio optimization toolkit implementing mean-variance, Black–Litterman, and risk-parity models. Handles covariance shrinkage and efficient frontier plotting.
 When to use: Constructing, analyzing, and backtesting optimal portfolios.
 Install:
pip install PyPortfolioOpt



### 4️⃣ Qlib
Microsoft’s open-source platform for quantitative research and machine-learning-based trading strategies. Provides data pipelines, factor modeling, and backtesting.
 When to use: Researching alpha factors, experimenting with ML-driven portfolio strategies.
 Install:
pip install pyqlib


### 5️⃣ Arch
Econometrics library focused on volatility and time-series modeling. Implements ARCH, GARCH, EGARCH, and volatility forecasting tools used in risk modeling.
 When to use: Modeling or forecasting time-dependent volatility and returns.
 Install:
pip install arch


6️⃣ Statsmodels
Classical econometrics and statistics, regression, ARIMA, hypothesis testing, and statistical inference. Essential for understanding relationships in data.
 When to use: Building and validating statistical or econometric models.
 Install:
pip install statsmodels


7️⃣ Backtrader
Full-featured backtesting and trading framework for strategy research and live trading. Lets you define strategies, run simulations, and visualize performance.
 When to use: Testing trading strategies, analyzing performance, or prototyping execution logic.
 Install:
pip install backtrader


8️⃣ QuantStats
Performance analytics and tear-sheet generation. Computes Sharpe, Sortino, drawdowns, and visualizes cumulative returns and factor exposures.
 When to use: After backtesting, to evaluate and visualize strategy performance.
 Install:
pip install quantstats


9️⃣ Empyrical
Lightweight library for calculating core performance metrics (returns, volatility, Sharpe, alpha, beta). Originally built for Quantopian.
 When to use: Quickly computing metrics in notebooks or backtesting pipelines.
 Install:
pip install empyrical


### 🔟 TA-Lib
Technical analysis toolkit with 150+ built-in indicators (RSI, MACD, Bollinger Bands, etc.). Extremely fast C-based implementation.
 When to use: Building or testing technical indicators for trading signals.
 Install:
pip install TA-Lib


### 🧩 Bonus Tip
Pair these with your core stack, NumPy, pandas, Matplotlib, scikit-learn, to cover the entire quant research workflow:
 data → modeling → optimization → backtesting → performance analysis.

