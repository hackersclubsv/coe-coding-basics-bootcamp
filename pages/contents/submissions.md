---
layout: default
title: Workshop Submissions
---

# Submissions

{% assign excluded_files = "pages/setup-guide.md,pages/submission.md" | split: "," %}

{% for page in site.pages %}
  {% if page.path contains 'pages/' and page.name != 'setup-guide.md' %}
- [{{ page.title | default: page.name }}]({{ page.url | relative_url }})
  {% endif %}
{% endfor %}

**Back to [Homepage](https://hackersclubsv.github.io/coe-coding-basics-bootcamp/)**